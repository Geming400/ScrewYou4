package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.StructureUpdater.class)
public class StructureUpdater_1188122912Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void update__1538819376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538819376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void apply__1538819624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538819624L))
            info.setReturnValue(null);
    }


}
