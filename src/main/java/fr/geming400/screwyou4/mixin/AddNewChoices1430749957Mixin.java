package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.AddNewChoices.class)
public class AddNewChoices1430749957Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1379021504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379021504L))
            info.setReturnValue(null);
    }


}
