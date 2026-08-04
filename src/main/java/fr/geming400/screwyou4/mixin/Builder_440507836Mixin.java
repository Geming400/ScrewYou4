package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.SequentialEntry.Builder.class)
public class Builder_440507836Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer;", cancellable = true)
    private void build__1476609610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476609610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "then(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/SequentialEntry$Builder;", cancellable = true)
    private void then__1360173698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360173698L))
            info.setReturnValue(null);
    }


}
