package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.MusicToastDisplayState.class)
public class MusicToastDisplayState_311786731Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/MusicToastDisplayState;", cancellable = true)
    private static void values_1467986126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467986126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/MusicToastDisplayState;", cancellable = true)
    private static void valueOf_1036907687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036907687L))
            info.setReturnValue(net.minecraft.client.MusicToastDisplayState.PAUSE);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__588973462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588973462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderToast()Z", cancellable = true)
    private void renderToast__498968816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498968816L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "renderInPauseScreen()Z", cancellable = true)
    private void renderInPauseScreen_1226173786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226173786L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void tooltip__387933760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387933760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_399995352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399995352L))
            info.setReturnValue("L@V*01<e\u7BFD!_\u19BDMa\",\uC4D6\uFC9Dcr.Ywm!IuFeoi<Sg+{4\u83C8{1m\u2822G\uCB2B\u2252q5\uCDFE@:H\uA7D3>1M\u7847p'R.0\u4DA5fm{,aQ`&9 s\u096A5A(N,+&(X");
    }


}
