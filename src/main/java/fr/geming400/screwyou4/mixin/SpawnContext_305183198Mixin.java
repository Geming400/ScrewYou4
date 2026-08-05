package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.SpawnContext.class)
public class SpawnContext_305183198Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1690695456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690695456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__830276778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830276778L))
            info.setReturnValue("\"D끁=`Xq4&HC&V@ẘ缙p8BuDR8cE&^lMILcwG썭D1უR@xjByX,_b:;4%z +6$`I+W/굜쯑_J콭J}!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_343445939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343445939L))
            info.setReturnValue(941169956);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/variant/SpawnContext;", cancellable = true)
    private static void create_2004492425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004492425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1588203682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588203682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/ServerLevelAccessor;", cancellable = true)
    private void level_1811375125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811375125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_2058791163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058791163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void biome_1854058969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854058969L))
            info.setReturnValue(null);
    }


}
