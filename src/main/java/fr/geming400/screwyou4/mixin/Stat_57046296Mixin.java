package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.Stat.class)
public class Stat_57046296Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1442558058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442558058L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1078414176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1078414176L))
            info.setReturnValue("a![J6grM7\u950EuC\u1731cIm$\u7967\u9CF1$T\u9382!(:[Di;\u448D\u0FBC,f^5s`VX\u483C6\u11BB\u7BD4akh){P\uB436s:b;58ibt{\u190En\uFD10oqF5`y\u2985e\u1D48ox?P]E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_95308541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95308541L))
            info.setReturnValue(-928868612);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue_1916238514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916238514L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "format(I)Ljava/lang/String;", cancellable = true)
    private void format__1363823289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363823289L))
            info.setReturnValue("9eq-8=8j)0ateo7|1%rV<[dm.FO\u7292\u4EB4^!1E$zJE_a");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/stats/StatType;", cancellable = true)
    private void getType_1986739443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986739443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildName(Lnet/minecraft/stats/StatType;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void buildName_1641481535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641481535L))
            info.setReturnValue("t");
    }


}
