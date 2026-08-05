package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEntityLoot.class)
public class VanillaEntityLoot105929880Mixin {
        @Inject(at = @At("HEAD"), method = "generate()V", cancellable = true)
    private void generate_1797025526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1797025526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "elderGuardianLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void elderGuardianLootTable_1182052235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182052235L))
            info.setReturnValue(null);
    }


}
