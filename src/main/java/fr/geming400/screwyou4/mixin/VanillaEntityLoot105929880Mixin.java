package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEntityLoot.class)
public class VanillaEntityLoot105929880Mixin {
        @Inject(at = @At("HEAD"), method = "generate()V", cancellable = true)
    private void generate_144204619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(144204619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "elderGuardianLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void elderGuardianLootTable__627448256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627448256L))
            info.setReturnValue(null);
    }


}
