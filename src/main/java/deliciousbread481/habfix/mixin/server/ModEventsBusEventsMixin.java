package deliciousbread481.habfix.mixin.server;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "app.netlify.xbb.HotAirBalloon.content.event.ModEventsBusEvents", remap = false)
public class ModEventsBusEventsMixin {

    @Inject(method = "registerRenderers", at = @At("HEAD"), cancellable = true, remap = false)
    private static void habfix$skipRendererRegistrationOnServer(CallbackInfo ci) {
        ci.cancel();
    }
}