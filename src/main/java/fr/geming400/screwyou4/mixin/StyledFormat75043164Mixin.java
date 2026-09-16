package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.numbers.StyledFormat.class)
public class StyledFormat75043164Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/chat/numbers/NumberFormatType;", cancellable = true)
    private void type__640470459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640470459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__833583104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833583104L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_845466689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845466689L))
            info.setReturnValue("69");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_632395255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632395255L))
            info.setReturnValue(-1573682346);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void format_1270780439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270780439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style__839046868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839046868L))
            info.setReturnValue(null);
    }


}
