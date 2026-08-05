package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedList.Builder.class)
public class Builder1341642408Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private void add__1662463207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662463207L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private void add__1451557476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451557476L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void build_1113971580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113971580L))
            info.setReturnValue(null);
    }


}
