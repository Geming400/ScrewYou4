package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowEntity.class)
public class ShowEntity1112780080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1796674957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796674957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__22679895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22679895L))
            info.setReturnValue("{?Z㔓R]랹D-@fMN斥28k촙涱/DsR@*鎰E刚!E%:fx_OticX듏2Q+>ZwDk?S<e%Dgf/e″G)?x6?5c＾{teKC鷕<4DG뀜(|J熵");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1151042822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151042822L))
            info.setReturnValue(179933031);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__454344604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454344604L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_ITEM);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/network/chat/HoverEvent$EntityTooltipInfo;", cancellable = true)
    private void entity_1496186154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496186154L))
            info.setReturnValue(null);
    }


}
