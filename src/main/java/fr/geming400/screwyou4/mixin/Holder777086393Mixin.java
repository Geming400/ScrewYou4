package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerRegistries.Holder.class)
public class Holder777086393Mixin {
        @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup_463879060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463879060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/LootTable;", cancellable = true)
    private void getLootTable__1650482284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650482284L))
            info.setReturnValue(null);
    }


}
