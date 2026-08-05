package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.EntryGroup.Builder.class)
public class Builder1208224656Mixin {
        @Inject(at = @At("HEAD"), method = "append(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/EntryGroup$Builder;", cancellable = true)
    private void append_599656075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599656075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer;", cancellable = true)
    private void build_2085691485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085691485L))
            info.setReturnValue(null);
    }


}
