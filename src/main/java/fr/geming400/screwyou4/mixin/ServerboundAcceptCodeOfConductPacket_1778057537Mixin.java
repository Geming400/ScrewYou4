package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundAcceptCodeOfConductPacket.class)
public class ServerboundAcceptCodeOfConductPacket_1778057537Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_99032448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99032448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1131397501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131397501L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_642597561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642597561L))
            info.setReturnValue("c윫)]䧉qX:O∉+bM鄫OPs=2,V1FR2|vWq)jCdF蝘Kbt>:B2.奶1s!@@^굪ⵦ&RV:pv및T爿oR㥶懿@1嘾L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1816320278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816320278L))
            info.setReturnValue(881538901);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1838840847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838840847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle__2114238322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114238322L))
            info.cancel();
    }


}
