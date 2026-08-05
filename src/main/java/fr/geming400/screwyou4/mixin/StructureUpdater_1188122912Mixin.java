package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.StructureUpdater.class)
public class StructureUpdater_1188122912Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void update__1830965991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830965991L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/String;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void apply__1577940410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577940410L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
