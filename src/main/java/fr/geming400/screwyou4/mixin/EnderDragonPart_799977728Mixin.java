package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EnderDragonPart.class)
public class EnderDragonPart_799977728Mixin {
        @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void is_1228412345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228412345L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_646436285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646436285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldBeSaved()Z", cancellable = true)
    private void shouldBeSaved_533822085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533822085L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_854907063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854907063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions_1451196390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451196390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__15309630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15309630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__752556655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752556655L))
            info.setReturnValue(true);
    }


}
