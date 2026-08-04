package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityZombieVillagerTypeFix.class)
public class EntityZombieVillagerTypeFix_67717826Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag_1974835456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974835456L))
            info.setReturnValue(null);
    }


}
