package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.ValueInputContextHelper.class)
public class ValueInputContextHelper_595191978Mixin {
        @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup_281984644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281984644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private void empty_137036046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137036046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private void emptyList_670468731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670468731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ops()Lcom/mojang/serialization/DynamicOps;", cancellable = true)
    private void ops__1434279028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434279028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyTypedList()Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;", cancellable = true)
    private void emptyTypedList_123577332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123577332L))
            info.setReturnValue(null);
    }


}
