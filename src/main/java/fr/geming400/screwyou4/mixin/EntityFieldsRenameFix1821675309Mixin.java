package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityFieldsRenameFix.class)
public class EntityFieldsRenameFix1821675309Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag_873785265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873785265L))
            info.setReturnValue(null);
    }


}
