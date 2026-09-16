package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayerGameMode.class)
public class ServerPlayerGameMode_535507087Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_405823428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405823428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void setLevel__752582640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-752582640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "changeGameModeForPlayer(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void changeGameModeForPlayer_549774663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549774663L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGameModeForPlayer()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameModeForPlayer__1166205293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166205293L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "getPreviousGameModeForPlayer()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPreviousGameModeForPlayer__1546000036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546000036L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative_1948164844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948164844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useItem(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItem__1096581423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096581423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn_296227776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296227776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void destroyBlock__645357556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645357556L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSurvival()Z", cancellable = true)
    private void isSurvival__1449858883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449858883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleBlockBreakAction(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;Lnet/minecraft/core/Direction;II)V", cancellable = true)
    private void handleBlockBreakAction__2093190651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093190651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroyAndAck(Lnet/minecraft/core/BlockPos;ILjava/lang/String;)V", cancellable = true)
    private void destroyAndAck_1949050084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1949050084L))
            info.cancel();
    }


}
