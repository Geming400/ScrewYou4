package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.SequentialEntry.Builder.class)
public class Builder_440507836Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer;", cancellable = true)
    private void build_1317974664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317974664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "then(Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/entries/SequentialEntry$Builder;", cancellable = true)
    private void then__1142620863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1142620863L))
            info.setReturnValue(null);
    }


}
