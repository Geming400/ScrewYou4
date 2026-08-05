package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.TriState.class)
public class TriState_1483667140Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/TriState;", cancellable = true)
    private static void values__241357817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241357817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/TriState;", cancellable = true)
    private static void valueOf__878257494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878257494L))
            info.setReturnValue(net.minecraft.util.TriState.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "from(Z)Lnet/minecraft/util/TriState;", cancellable = true)
    private static void from_1853599402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853599402L))
            info.setReturnValue(net.minecraft.util.TriState.TRUE);
    }

    @Inject(at = @At("HEAD"), method = "toBoolean(Z)Z", cancellable = true)
    private void toBoolean__1581679484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581679484L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_348206668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348206668L))
            info.setReturnValue(".鏓2xDe&j:y笪[飝Cd鉭uy>65bm]iZ譤|㫎ᦵ㖖6%Ymq)hRu=iy\"");
    }


}
