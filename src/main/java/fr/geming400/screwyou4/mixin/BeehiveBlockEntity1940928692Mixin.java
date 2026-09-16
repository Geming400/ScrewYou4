package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.class)
public class BeehiveBlockEntity1940928692Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1294922232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294922232L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFull()Z", cancellable = true)
    private void isFull_1389342514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389342514L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues_1481841318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1481841318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emptyAllLivingFromHive(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;)V", cancellable = true)
    private void emptyAllLivingFromHive__473468102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-473468102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFireNearby()Z", cancellable = true)
    private void isFireNearby__1828052820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828052820L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOccupantCount()I", cancellable = true)
    private void getOccupantCount_1833454206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833454206L))
            info.setReturnValue(484034394);
    }

    @Inject(at = @At("HEAD"), method = "addOccupant(Lnet/minecraft/world/entity/animal/bee/Bee;)V", cancellable = true)
    private void addOccupant_590904031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590904031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHoneyLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private static void getHoneyLevel__932408606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932408606L))
            info.setReturnValue(1302179678);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity;)V", cancellable = true)
    private static void serverTick__1122650698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1122650698L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_505281205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505281205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1828100434(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1828100434L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeBee(Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;)V", cancellable = true)
    private void storeBee_864142048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(864142048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSedated()Z", cancellable = true)
    private void isSedated__1312840751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312840751L))
            info.setReturnValue(false);
    }


}
