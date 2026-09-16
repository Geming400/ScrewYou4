package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ServerExplosion.class)
public class ServerExplosion_905238108Mixin {
        @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level__2029515217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029515217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDamageSource()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getDamageSource_119786113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119786113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_895109087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895109087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSmall()Z", cancellable = true)
    private void isSmall__41459659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41459659L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius__1921695828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921695828L))
            info.setReturnValue(6.958517E8F);
    }

    @Inject(at = @At("HEAD"), method = "shouldAffectBlocklikeEntities()Z", cancellable = true)
    private void shouldAffectBlocklikeEntities__852414859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852414859L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "explode()I", cancellable = true)
    private void explode__630056960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630056960L))
            info.setReturnValue(-496321160);
    }

    @Inject(at = @At("HEAD"), method = "canTriggerBlocks()Z", cancellable = true)
    private void canTriggerBlocks__2118215324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2118215324L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHitPlayers()Ljava/util/Map;", cancellable = true)
    private void getHitPlayers_399333518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399333518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockInteraction()Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private void getBlockInteraction_679598900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679598900L))
            info.setReturnValue(net.minecraft.world.level.Explosion.BlockInteraction.DESTROY);
    }

    @Inject(at = @At("HEAD"), method = "getIndirectSourceEntity()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getIndirectSourceEntity_1278548918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278548918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirectSourceEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getDirectSourceEntity_578700004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578700004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeenPercent(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void getSeenPercent_196077999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196077999L))
            info.setReturnValue(6.958517E8F);
    }


}
