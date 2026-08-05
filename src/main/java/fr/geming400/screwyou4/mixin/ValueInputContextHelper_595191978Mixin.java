package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.ValueInputContextHelper.class)
public class ValueInputContextHelper_595191978Mixin {
        @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup_396419710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396419710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private void empty__256231141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256231141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private void emptyList__873752496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873752496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ops()Lcom/mojang/serialization/DynamicOps;", cancellable = true)
    private void ops__837049062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837049062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyTypedList()Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;", cancellable = true)
    private void emptyTypedList_2000989689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000989689L))
            info.setReturnValue(null);
    }


}
