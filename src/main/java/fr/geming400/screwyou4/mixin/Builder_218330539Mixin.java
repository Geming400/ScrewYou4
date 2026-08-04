package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyCustomDataFunction.Builder.class)
public class Builder_218330539Mixin {
        @Inject(at = @At("HEAD"), method = "copy(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private void copy_842776408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842776408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy(Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$MergeStrategy;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private void copy__1630603923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630603923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__495229616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495229616L))
            info.setReturnValue(null);
    }


}
