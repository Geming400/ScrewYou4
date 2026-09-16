package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapItemSavedData.class)
public class MapItemSavedData_252661224Mixin {
        @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/world/level/saveddata/maps/MapId;)Lnet/minecraft/world/level/saveddata/SavedDataType;", cancellable = true)
    private static void type_803272302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803272302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(IIB)V", cancellable = true)
    private void setColor__2048744307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2048744307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1552126453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552126453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateColor(IIB)Z", cancellable = true)
    private void updateColor_847894154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847894154L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkBanners(Lnet/minecraft/world/level/BlockGetter;II)V", cancellable = true)
    private void checkBanners_1196325204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1196325204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHoldingPlayer(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData$HoldingPlayer;", cancellable = true)
    private void getHoldingPlayer__1881173352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881173352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleBanner(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void toggleBanner__791616790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791616790L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createFresh(DDBZZLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void createFresh__1620298141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620298141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickCarriedBy(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/decoration/ItemFrame;)V", cancellable = true)
    private void tickCarriedBy__827655425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-827655425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "locked()Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void locked_1995758433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995758433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaled()Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void scaled_1840546833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840546833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecorations()Ljava/lang/Iterable;", cancellable = true)
    private void getDecorations_1779630780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779630780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removedFromFrame(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void removedFromFrame_860809084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(860809084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTrackedCountOverLimit(I)Z", cancellable = true)
    private void isTrackedCountOverLimit__1624473649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624473649L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addClientSideDecorations(Ljava/util/List;)V", cancellable = true)
    private void addClientSideDecorations__992565045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-992565045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isExplorationMap()Z", cancellable = true)
    private void isExplorationMap_1948155259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948155259L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addTargetDecoration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private static void addTargetDecoration_784084614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(784084614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createForClient(BZLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void createForClient__1417003737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417003737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBanners()Ljava/util/Collection;", cancellable = true)
    private void getBanners_1232132520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232132520L))
            info.setReturnValue(null);
    }


}
