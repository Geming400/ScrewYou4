package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamageSourcePredicate.class)
public class DamageSourcePredicate_1607986385Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_699360116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699360116L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1916557387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916557387L))
            info.setReturnValue("P\u700Du");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2129628821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129628821L))
            info.setReturnValue(1932148195);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches_1664359869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664359869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches__530399278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530399278L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Ljava/util/Optional;", cancellable = true)
    private void isDirect_1165411121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165411121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/List;", cancellable = true)
    private void tags__691271527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691271527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Ljava/util/Optional;", cancellable = true)
    private void sourceEntity_68459612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68459612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directEntity()Ljava/util/Optional;", cancellable = true)
    private void directEntity__375671894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375671894L))
            info.setReturnValue(null);
    }


}
