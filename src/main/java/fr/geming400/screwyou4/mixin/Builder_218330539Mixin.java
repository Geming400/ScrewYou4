package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyCustomDataFunction.Builder.class)
public class Builder_218330539Mixin {
        @Inject(at = @At("HEAD"), method = "copy(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private void copy__1525634685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525634685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy(Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$MergeStrategy;)Lnet/minecraft/world/level/storage/loot/functions/CopyCustomDataFunction$Builder;", cancellable = true)
    private void copy__1515216158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515216158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__2072078558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072078558L))
            info.setReturnValue(null);
    }


}
