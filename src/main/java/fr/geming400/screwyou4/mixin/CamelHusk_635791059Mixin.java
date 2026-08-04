package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.camel.CamelHusk.class)
public class CamelHusk_635791059Mixin {
        @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__2061387656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061387656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/camel/Camel;", cancellable = true)
    private void getBreedOffspring_584476917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584476917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1845094269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845094269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chargeSpeedModifier()F", cancellable = true)
    private void chargeSpeedModifier_674050421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674050421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_674069641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674069641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMobControlled()Z", cancellable = true)
    private void isMobControlled_674069641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674069641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__1667110536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667110536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_674069641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674069641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeABaby()Z", cancellable = true)
    private void canBeABaby_674069641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674069641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1924641106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924641106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1197854564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197854564L))
            info.setReturnValue(null);
    }


}
