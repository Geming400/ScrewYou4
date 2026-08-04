package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.MissingTableProblem.class)
public class MissingTableProblem_1534726028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1374729010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374729010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_399266052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399266052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1572988769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572988769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id__1951749956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951749956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_399265556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399265556L))
            info.setReturnValue(null);
    }


}
