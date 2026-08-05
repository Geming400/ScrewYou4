package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.class)
public class BeehiveBlockEntity1940928692Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1979207275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979207275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFull()Z", cancellable = true)
    private void isFull_1979207275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979207275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_721797340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(721797340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues__1125761512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1125761512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1979203431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979203431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOccupant(Lnet/minecraft/world/entity/animal/bee/Bee;)V", cancellable = true)
    private void addOccupant__866730655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-866730655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHoneyLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private static void getHoneyLevel_1795623617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795623617L))
            info.setReturnValue(1222614362);
    }

    @Inject(at = @At("HEAD"), method = "isFireNearby()Z", cancellable = true)
    private void isFireNearby_1979207275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979207275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOccupantCount()I", cancellable = true)
    private void getOccupantCount_1979190938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979190938L))
            info.setReturnValue(-1188662883);
    }

    @Inject(at = @At("HEAD"), method = "emptyAllLivingFromHive(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;)V", cancellable = true)
    private void emptyAllLivingFromHive__372408303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-372408303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeBee(Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$Occupant;)V", cancellable = true)
    private void storeBee_1605026209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1605026209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSedated()Z", cancellable = true)
    private void isSedated_1979207275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979207275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity;)V", cancellable = true)
    private static void serverTick__1508369866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1508369866L))
            info.cancel();
    }


}
