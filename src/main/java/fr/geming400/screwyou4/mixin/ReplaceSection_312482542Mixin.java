package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.ReplaceSection.class)
public class ReplaceSection_312482542Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size_557943963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557943963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode__1418598031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418598031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1697994800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697994800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__822977434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822977434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_350745283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350745283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply__646015258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646015258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_350744787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350744787L))
            info.setReturnValue(null);
    }


}
