package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.RaiderPredicate.class)
public class RaiderPredicate_1071457758Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_162831489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162831489L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1841881282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841881282L))
            info.setReturnValue("a(30=B9O\u397D[-vt\u53C3\u2F9EC`\uAF1Fy\"g!AM\u24121nGejX)ff5\u23FBF7m`}\u26AA3_xke\u8EBBNK}!\u44F8\u312Dx$^&)2`Fe?D]UH*\u6C6Ejy'?z#$\uF917vC<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1628809848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628809848L))
            info.setReturnValue(-404563680);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1873200605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873200605L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isCaptain()Z", cancellable = true)
    private void isCaptain_1387792698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387792698L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasRaid()Z", cancellable = true)
    private void hasRaid__1052348208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052348208L))
            info.setReturnValue(true);
    }


}
