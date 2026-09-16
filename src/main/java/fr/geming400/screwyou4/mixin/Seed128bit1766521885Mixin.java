package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomSupport.Seed128bit.class)
public class Seed128bit1766521885Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_857895617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857895617L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1758021886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758021886L))
            info.setReturnValue(" vn)\u88CE] Zb`;KUe{Z`Af\u569AQM5_hETWRz(L9u-.[CV\u9EFBK5\u5C83.lH\u4A5AQrJe>@\u0614JPltR&@K:-\u8A2EKv0\u0EB3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1971093320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971093320L))
            info.setReturnValue(1785771202);
    }

    @Inject(at = @At("HEAD"), method = "xor(JJ)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void xor__1916005056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916005056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xor(Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void xor_35352839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35352839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedHi()J", cancellable = true)
    private void seedHi_1445697970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445697970L))
            info.setReturnValue(-7825359053564124876L);
    }

    @Inject(at = @At("HEAD"), method = "seedLo()J", cancellable = true)
    private void seedLo_872520304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872520304L))
            info.setReturnValue(4951414611896454626L);
    }

    @Inject(at = @At("HEAD"), method = "mixed()Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void mixed__246228064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246228064L))
            info.setReturnValue(null);
    }


}
