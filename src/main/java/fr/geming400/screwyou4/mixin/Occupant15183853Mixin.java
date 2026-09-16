package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.Occupant.class)
public class Occupant15183853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__893442415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893442415L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_785607378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785607378L))
            info.setReturnValue("@q-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_572535944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572535944L))
            info.setReturnValue(1442478035);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;", cancellable = true)
    private static void of__1999839826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999839826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;", cancellable = true)
    private static void create__446464567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446464567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityData()Lnet/minecraft/world/item/component/TypedEntityData;", cancellable = true)
    private void entityData__577046706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577046706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksInHive()I", cancellable = true)
    private void ticksInHive_1551210600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551210600L))
            info.setReturnValue(347572491);
    }

    @Inject(at = @At("HEAD"), method = "minTicksInHive()I", cancellable = true)
    private void minTicksInHive_77111002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77111002L))
            info.setReturnValue(747316891);
    }

    @Inject(at = @At("HEAD"), method = "createEntity(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void createEntity_1366118361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366118361L))
            info.setReturnValue(null);
    }


}
