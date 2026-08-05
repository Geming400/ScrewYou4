package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedList.Builder.class)
public class Builder1341642408Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private void add__230323494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230323494L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private void add__1682454085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682454085L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void build_835158542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835158542L))
            info.setReturnValue(null);
    }


}
