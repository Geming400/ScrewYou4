package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SideChainPart.class)
public class SideChainPart_650528513Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__484931959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484931959L))
            info.setReturnValue("`%jhC{\u305Bq;xRn'\u96ACt0llV0");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private static void values_1043452066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043452066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private static void valueOf_471484191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471484191L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_688807095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688807095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "whenDisconnectedFromTheLeft()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenDisconnectedFromTheLeft_20659057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20659057L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "whenDisconnectedFromTheRight()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenDisconnectedFromTheRight_20659057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20659057L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__484931959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484931959L))
            info.setReturnValue("`%jhC{\u305Bq;xRn'\u96ACt0llV0");
    }

    @Inject(at = @At("HEAD"), method = "isChainEnd()Z", cancellable = true)
    private void isChainEnd_688807095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688807095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isConnectionTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void isConnectionTowards_1640912745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640912745L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "whenConnectedToTheRight()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenConnectedToTheRight_20659057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20659057L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "whenConnectedToTheLeft()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenConnectedToTheLeft_20659057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20659057L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }


}
