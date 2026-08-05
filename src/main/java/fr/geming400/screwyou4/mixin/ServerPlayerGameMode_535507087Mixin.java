package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayerGameMode.class)
public class ServerPlayerGameMode_535507087Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_573781825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(573781825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void setLevel__442902254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-442902254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival_573785669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573785669L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn_1468917401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468917401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative_573785669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573785669L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useItem(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItem__333295849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333295849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameModeForPlayer()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameModeForPlayer__859939212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859939212L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "changeGameModeForPlayer(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void changeGameModeForPlayer_781787564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781787564L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void destroyBlock_704277529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704277529L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPreviousGameModeForPlayer()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPreviousGameModeForPlayer__859939212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859939212L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "handleBlockBreakAction(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;Lnet/minecraft/core/Direction;II)V", cancellable = true)
    private void handleBlockBreakAction__1347443083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1347443083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroyAndAck(Lnet/minecraft/core/BlockPos;ILjava/lang/String;)V", cancellable = true)
    private void destroyAndAck__937940688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-937940688L))
            info.cancel();
    }


}
