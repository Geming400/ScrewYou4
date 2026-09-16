package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ItemFrame.class)
public class ItemFrame_381204212Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1124030681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124030681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move_1926649460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926649460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(DDD)V", cancellable = true)
    private void push_972328756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(972328756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill_754910425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(754910425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__626045917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626045917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__112961120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112961120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__434083642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434083642L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1335446251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335446251L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_436133547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436133547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_227662769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227662769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_986766073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986766073L))
            info.setReturnValue(1.907634E8F);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1087938559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1087938559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_1392864928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1392864928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_1956393533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956393533L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAnalogOutput()I", cancellable = true)
    private void getAnalogOutput__284017486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284017486L))
            info.setReturnValue(820722499);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()I", cancellable = true)
    private void getRotation__535087003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535087003L))
            info.setReturnValue(851523304);
    }

    @Inject(at = @At("HEAD"), method = "survives()Z", cancellable = true)
    private void survives__22154871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22154871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound_1791001320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791001320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;Z)V", cancellable = true)
    private void setItem__378584960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-378584960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__614526762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-614526762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRotation(I)V", cancellable = true)
    private void setRotation_1128582175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1128582175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem_812003504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(812003504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotateItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRotateItemSound_612287882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612287882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAddItemSound_1411191076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411191076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoveItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRemoveItemSound_1384628467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384628467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFramedMap()Z", cancellable = true)
    private void hasFramedMap_1364282303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364282303L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFramedMapId(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void getFramedMapId_582078797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582078797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound__2039138921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039138921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound__1228456049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228456049L))
            info.setReturnValue(null);
    }


}
