package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.Occupant.class)
public class Occupant15183853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1400696112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400696112L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1120276122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120276122L))
            info.setReturnValue("\u4B10u\uC4B5N$jU}7b_*xp\u13AA|\uBC64HB1#-m3ch|AM(G\"<N6n1\u61CEIpY\u899B&']TP_QU+xV\u7508UtL}7vKp@03)A]B6ok^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_53446595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53446595L))
            info.setReturnValue(1241834114);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;", cancellable = true)
    private static void of_1654215653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654215653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;", cancellable = true)
    private static void create__935337147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935337147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEntity(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void createEntity__1378633608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378633608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityData()Lnet/minecraft/world/item/component/TypedEntityData;", cancellable = true)
    private void entityData_309576737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309576737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksInHive()I", cancellable = true)
    private void ticksInHive_53446099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53446099L))
            info.setReturnValue(1444981534);
    }

    @Inject(at = @At("HEAD"), method = "minTicksInHive()I", cancellable = true)
    private void minTicksInHive_53446099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53446099L))
            info.setReturnValue(1444981534);
    }


}
