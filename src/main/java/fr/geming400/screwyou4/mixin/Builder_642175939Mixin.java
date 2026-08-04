package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.AlternativesEntry.Builder.class)
public class Builder_642175939Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer;", cancellable = true)
    private void build__1274941507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274941507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "otherwise(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private void otherwise__936475156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936475156L))
            info.setReturnValue(null);
    }


}
