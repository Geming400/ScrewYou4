package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SideChainPart.class)
public class SideChainPart_650528513Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1420951541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420951541L))
            info.setReturnValue("hx>w\u852Bb+hi\u9158uWA*3=A2Y<\uB929[O\u65020Mvz?N%f:\uAD027;.zQOz\u6AA0]`H%$,H9GX\u55E5I{\uA91FkL3dcan6</]H)[cxIbH\u66C2{+j<6L-\uB532tsTD");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private static void values__948229952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948229952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private static void valueOf_632732743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632732743L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_786132760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786132760L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_738737134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738737134L))
            info.setReturnValue("@g6Y)sy4\u6375\uBC61\u3348>+u\u6731=\uD2A7\u37556E\u4AD4;DSaD/z0dSC:1LDm\u7170\u9D3C}\u4AD5");
    }

    @Inject(at = @At("HEAD"), method = "isConnectionTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void isConnectionTowards_1242566869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242566869L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "whenConnectedToTheRight()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenConnectedToTheRight_270835462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270835462L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "whenConnectedToTheLeft()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenConnectedToTheLeft__1255570081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255570081L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "whenDisconnectedFromTheRight()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenDisconnectedFromTheRight_1579608987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579608987L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.UNCONNECTED);
    }

    @Inject(at = @At("HEAD"), method = "whenDisconnectedFromTheLeft()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void whenDisconnectedFromTheLeft_1141953066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141953066L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.CENTER);
    }

    @Inject(at = @At("HEAD"), method = "isChainEnd()Z", cancellable = true)
    private void isChainEnd__1097439853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097439853L))
            info.setReturnValue(true);
    }


}
