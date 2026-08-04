package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityWolfColorFix.class)
public class EntityWolfColorFix_1749861687Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag__637987979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637987979L))
            info.setReturnValue(null);
    }


}
