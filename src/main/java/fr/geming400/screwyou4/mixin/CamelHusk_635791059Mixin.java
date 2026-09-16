package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.camel.CamelHusk.class)
public class CamelHusk_635791059Mixin {
        @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1312281056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312281056L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__371459070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371459070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chargeSpeedModifier()F", cancellable = true)
    private void chargeSpeedModifier_491557323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491557323L))
            info.setReturnValue(9.247891E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_775675158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775675158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/camel/Camel;", cancellable = true)
    private void getBreedOffspring_868814739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868814739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__22738652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22738652L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_957684807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957684807L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isMobControlled()Z", cancellable = true)
    private void isMobControlled__1881021083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881021083L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_611664646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611664646L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_264431567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264431567L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeABaby()Z", cancellable = true)
    private void canBeABaby_1587435173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587435173L))
            info.setReturnValue(false);
    }


}
