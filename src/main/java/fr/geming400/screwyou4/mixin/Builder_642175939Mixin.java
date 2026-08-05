package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.AlternativesEntry.Builder.class)
public class Builder_642175939Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer;", cancellable = true)
    private void build_1519642767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519642767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "otherwise(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/AlternativesEntry$Builder;", cancellable = true)
    private void otherwise__435180872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435180872L))
            info.setReturnValue(null);
    }


}
