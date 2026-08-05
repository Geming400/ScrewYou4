package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerRegistries.Holder.class)
public class Holder777086393Mixin {
        @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup_578314126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578314126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/LootTable;", cancellable = true)
    private void getLootTable_1047474756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047474756L))
            info.setReturnValue(null);
    }


}
