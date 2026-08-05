package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ServerExplosion.class)
public class ServerExplosion_905238108Mixin {
        @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level_1572776107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572776107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldAffectBlocklikeEntities()Z", cancellable = true)
    private void shouldAffectBlocklikeEntities_943516690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943516690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockInteraction()Lnet/minecraft/world/level/Explosion$BlockInteraction;", cancellable = true)
    private void getBlockInteraction__866116551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866116551L))
            info.setReturnValue(net.minecraft.world.level.Explosion.BlockInteraction.TRIGGER_BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "getDirectSourceEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getDirectSourceEntity__1560840735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560840735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndirectSourceEntity()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getIndirectSourceEntity_172999992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172999992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_2002967636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002967636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSmall()Z", cancellable = true)
    private void isSmall_943516690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943516690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHitPlayers()Ljava/util/Map;", cancellable = true)
    private void getHitPlayers__1099385533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099385533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDamageSource()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getDamageSource__1811293855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811293855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explode()I", cancellable = true)
    private void explode_943500353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943500353L))
            info.setReturnValue(737357031);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius_943497470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943497470L))
            info.setReturnValue(1.45641E7F);
    }

    @Inject(at = @At("HEAD"), method = "canTriggerBlocks()Z", cancellable = true)
    private void canTriggerBlocks_943516690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943516690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSeenPercent(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void getSeenPercent__610497469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-610497469L))
            info.setReturnValue(1.45641E7F);
    }


}
