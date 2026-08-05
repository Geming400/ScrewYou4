package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapItemSavedData.class)
public class MapItemSavedData_252661224Mixin {
        @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/world/level/saveddata/maps/MapId;)Lnet/minecraft/world/level/saveddata/SavedDataType;", cancellable = true)
    private static void type__2099182872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099182872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(IIB)V", cancellable = true)
    private void setColor__533895828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-533895828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "locked()Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void locked_1824212907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824212907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__588978478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588978478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBanners(Lnet/minecraft/world/level/BlockGetter;II)V", cancellable = true)
    private void checkBanners_732681973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(732681973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFresh(DDBZZLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void createFresh_1688084405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688084405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHoldingPlayer(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData$HoldingPlayer;", cancellable = true)
    private void getHoldingPlayer__2080068058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080068058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleBanner(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void toggleBanner__198885750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198885750L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickCarriedBy(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/decoration/ItemFrame;)V", cancellable = true)
    private void tickCarriedBy__940926661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-940926661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scaled()Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void scaled_1824212907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824212907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isExplorationMap()Z", cancellable = true)
    private void isExplorationMap_290939806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290939806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateColor(IIB)Z", cancellable = true)
    private void updateColor__533891984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533891984L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addClientSideDecorations(Ljava/util/List;)V", cancellable = true)
    private void addClientSideDecorations__526557365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-526557365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBanners()Ljava/util/Collection;", cancellable = true)
    private void getBanners__1560987049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560987049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecorations()Ljava/lang/Iterable;", cancellable = true)
    private void getDecorations__1757088465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757088465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removedFromFrame(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void removedFromFrame_1216858559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1216858559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTrackedCountOverLimit(I)Z", cancellable = true)
    private void isTrackedCountOverLimit_1466582039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466582039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createForClient(BZLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void createForClient_1042035407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042035407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTargetDecoration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private static void addTargetDecoration__888629848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-888629848L))
            info.cancel();
    }


}
