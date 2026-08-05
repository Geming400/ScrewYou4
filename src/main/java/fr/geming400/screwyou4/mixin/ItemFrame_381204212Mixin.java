package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ItemFrame.class)
public class ItemFrame_381204212Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1512688973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512688973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move__1722289181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1722289181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(DDD)V", cancellable = true)
    private void push__689202662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-689202662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill__597205129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-597205129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_904622871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904622871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()I", cancellable = true)
    private void getRotation_419466457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419466457L))
            info.setReturnValue(-1544374765);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_419463574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419463574L))
            info.setReturnValue(1.321023E8F);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_49534595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49534595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__1921697383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921697383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__68226120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68226120L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;Z)V", cancellable = true)
    private void setItem__1639800789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1639800789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_2115735499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115735499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1590507422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590507422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_761231195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761231195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__807584479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-807584479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_2026953655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026953655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_904622871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904622871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound_1471417109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471417109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound_1471417109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471417109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "survives()Z", cancellable = true)
    private void survives_419482794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419482794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRotation(I)V", cancellable = true)
    private void setRotation_1595121183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595121183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem_2025240078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2025240078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAnalogOutput()I", cancellable = true)
    private void getAnalogOutput_419466457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419466457L))
            info.setReturnValue(-1542359565);
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound_419478950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(419478950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAddItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAddItemSound_1471417109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471417109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoveItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRemoveItemSound_1471417109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471417109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFramedMap()Z", cancellable = true)
    private void hasFramedMap_419482794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419482794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFramedMapId(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void getFramedMapId__2086191293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086191293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotateItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRotateItemSound_1471417109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471417109L))
            info.setReturnValue(null);
    }


}
