package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityEquipmentToArmorAndHandFix.class)
public class EntityEquipmentToArmorAndHandFix_2130919638Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__678851824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678851824L))
            info.setReturnValue(null);
    }


}
