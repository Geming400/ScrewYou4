package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.FishingHookPredicate.class)
public class FishingHookPredicate_886930352Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2022524686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022524686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__248529624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248529624L))
            info.setReturnValue("0s-|w*={4Ze)\u8521Q\u2C1F\u5185ObQM3\uFC9B I[,{\u55BFLgZ`f\uBF79>KzC^U+L\u674768q\u5DA2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_925193093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925193093L))
            info.setReturnValue(2113320012);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1067261560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067261560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "inOpenWater()Ljava/util/Optional;", cancellable = true)
    private void inOpenWater_1132391773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132391773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOpenWater(Z)Lnet/minecraft/advancements/predicates/entity/FishingHookPredicate;", cancellable = true)
    private static void inOpenWater__1036688822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036688822L))
            info.setReturnValue(null);
    }


}
